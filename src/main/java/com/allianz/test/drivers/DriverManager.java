package com.allianz.test.drivers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class DriverManager {

    /**
     * We have an environment here, that should be responsible for the details of how each of the functions defined
     * in this class are performed. No specific information should be leaked into this class, and therefore the method
     * names should be kept as agnostic as possible. e.g. navigateToPage maybe done on a browser, or it may be that
     * an app needs to be opened first and then some navigation done, either way, the environment will figure that out.
     */
    private Environment environment;

    /**
     * Navigate to a page. Let the environment figure out how to do it.
     * @param url The page to get to.
     */
    public void navigateToPage(String url) {
       this.environment.navigateToPage(url);
    }

    /**
     * Hit a button. Could be a button click, or a tap etc. Again, let the environment figure out what it is.
      * @param buttonId The id of the button to click/tap.
     */
    public void hitButton(String buttonId) {
        this.environment.hitButton(buttonId);
    }
}
