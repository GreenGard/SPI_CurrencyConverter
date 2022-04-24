package org.example.provider;

import org.example.currency.Address;
import org.example.currency.Currency;

@Address("EUR")
public class EUR implements Currency {

        @Override
        public Double currency() {
            return 10.39;
        }}

