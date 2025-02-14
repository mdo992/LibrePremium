package xyz.kyngs.librepremium.common.config.migrate.config;

import xyz.kyngs.librepremium.api.Logger;
import xyz.kyngs.librepremium.common.config.ConfigurateHelper;
import xyz.kyngs.librepremium.common.config.migrate.ConfigurationMigrator;

import java.util.List;

public class FirstConfigurationMigrator implements ConfigurationMigrator {
    @Override
    public void migrate(ConfigurateHelper helper, Logger logger) {
        var limbo = helper.getString("limbo");

        helper.set("limbo", List.of(limbo));
    }
}
