package proxy;

import proxy.downloader.HelpdeskDownloader;
import proxy.library.ThirdPartyHelpdeskClass;
import proxy.proxy.HelpdeskCacheProxy;

public class Demo {
    public static void main(String[] args) {
        HelpdeskDownloader naiveDownloader = new HelpdeskDownloader(new ThirdPartyHelpdeskClass());
        HelpdeskDownloader smartDownloader = new HelpdeskDownloader(new HelpdeskCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(HelpdeskDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.loadAllTasks();
        downloader.loadTaskPage("task1");
        downloader.loadAllTasks();
        downloader.loadTaskPage("task3");

        downloader.loadTaskPage("task999");
        downloader.loadTaskPage("task1");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
