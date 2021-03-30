package cn.bdqn.service.impl;

import cn.bdqn.domain.Account;
import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> queryAll() {

        return accountMapper.selectAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("保存账号");
    }

    @Override
    public PageInfo<Account> queryAllByPage(Integer currentPage, Integer pageSize) {

        PageHelper.startPage(currentPage,pageSize);
        List<Account> accounts = accountMapper.selectAll();

        PageInfo<Account> pageInfo = new PageInfo<Account>(accounts);
        return pageInfo;
    }
}
