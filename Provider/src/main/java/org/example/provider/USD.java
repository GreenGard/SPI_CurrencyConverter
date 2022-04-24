package org.example.provider;

import org.example.currency.Address;
import org.example.currency.Currency;


@Address("USD")
public class USD implements Currency {

    @Override
    public Double currency() {
        return 9.5362;
    }
}
