package cn.bdqn.controller;


import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/queryAllByPage")
    public String queryAllByPage(@RequestParam(name = "currentPage",
            required = true,
            defaultValue = "1")
                                         Integer currentPage, Model model){
        PageInfo<Account> pageInfo = accountService.queryAllByPage(currentPage , 5);
        model.addAttribute("pageInfo",pageInfo);
        return "queryAllByPage";
    }


}
