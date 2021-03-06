package me.javaroad.oauth.controller.admin;

import static me.javaroad.oauth.controller.OAuthConstants.ADMIN_PREFIX;

import me.javaroad.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author heyx
 */
@Controller
@RequestMapping(ADMIN_PREFIX + "/oauth2")
public class AdminOAuth2Controller extends BaseController {

    @GetMapping("resource")
    public String resource() {
        return view("resource/index");
    }

    @GetMapping("scope")
    public String scope() {
        return view("scope/index");
    }

    @GetMapping("authority")
    public String authority() {
        return view("authority/index");
    }

    @GetMapping("client")
    public String client() {
        return view("client/index");
    }

    @GetMapping("client/form")
    public String createClient() {
        return view("client/form");
    }
}
