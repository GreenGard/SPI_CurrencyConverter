import org.example.currency.Currency;
import org.example.provider.EUR;
import org.example.provider.USD;



module org.example.provider {
    requires org.jetbrains.annotations;
    requires org.example.currency;
    provides Currency with USD, EUR;

}

