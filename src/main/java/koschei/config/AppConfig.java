package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean("island")
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean("egg")
    public static Egg6 getEgg6(Needle7 needle7){
        return new Egg6(needle7);
    }

    @Bean("needle")
    public static Needle7 getBeedle7(){
        return new Needle7();
    }
}
