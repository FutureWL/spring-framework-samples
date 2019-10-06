package io.github.futurewl.site;

import io.github.futurewl.config.annotation.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.Map;

@WebController
public class AccountController {
    @Inject
    AccountService accountService;

    @RequestMapping(value = "account/list", method = RequestMethod.GET)
    public String list(Map<String, Object> model) {
        model.put("accounts", this.accountService.getAllAccounts());
        return "account/list";
    }
}
