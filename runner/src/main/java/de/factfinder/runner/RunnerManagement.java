package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.ManagementApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class RunnerManagement {

    private static final Logger LOG = LogManager.getLogger(RunnerImport.class.getSimpleName());
    private static final String CHANNEL = Settings.getChannel();

    public static void main(final String[] args) {
        final ManagementApi managementClient = new ManagementApi(Settings.getClient());

        try {
            LOG.info("Cache flush");
            managementClient.flushCacheUsingPOST(Arrays.asList(CHANNEL));
        } catch (final ApiException e) {
            LOG.error("Exception when calling ManagementApi#flushCacheUsingPOST", e);
        }

        try {
            LOG.info("Reload configuration");
            managementClient.reloadConfigurationUsingPOST(Arrays.asList(CHANNEL));
        } catch (final ApiException e) {
            LOG.error("Exception when calling ManagementApi#reloadConfigurationUsingPOST", e);
        }

    }
}
