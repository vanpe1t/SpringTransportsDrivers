package com.example.springtransportsdrivers;


import com.example.springtransportsdrivers.models.Bus;
import com.example.springtransportsdrivers.models.Car;
import com.example.springtransportsdrivers.models.Driver;
import com.example.springtransportsdrivers.models.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {

    @Bean(name = "bus")
    @Scope("prototype")
    public Bus getBusBean() {
        return new Bus("Ekarus");
    }
    @Bean(name = "pickup")
    @Scope("prototype")
    public Pickup getPickupBean() {
        return new Pickup("Dodge Ram");
    }
    @Bean(name = "car")
    @Scope("prototype")
    public Car getCarBean() {
        return new Car("BMW");
    }

    @Bean(name = "busdriver")
    public Driver getBusDriver() {
        return new Driver("Вася", getBusBean());
    }

    @Bean(name = "pickupdriver")
    public Driver getPickupDriver() {
        return new Driver("Петя", getPickupBean());
    }

    @Bean(name = "carpdriver")
    public Driver getCarDriver() {
        return new Driver("Ваня", getCarBean());
    }
}
