package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/config.properties"
})
public interface ProjectConfig extends Config {

    @Key("browserstackUser")
    String browserstackUser();

    @Key("browserstackKey")
    String browserstackKey();

    @Key("browserstackAppUrl")
    String browserstackAppUrl();
}