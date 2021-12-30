package io.github.rlshep.bjcp2015beerstyles;

import android.content.res.Configuration;
import android.content.res.Resources;

import androidx.test.platform.app.InstrumentationRegistry;

import java.util.Locale;

public abstract class BJCPTest {
    protected void setLocale(String language, String country) {
        Locale locale = new Locale(language, country);
        // here we update locale for date formatters
        Locale.setDefault(locale);
        // here we update locale for app resources
        Resources res = InstrumentationRegistry.getInstrumentation().getTargetContext().getResources();
        Configuration config = res.getConfiguration();
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
    }
}
