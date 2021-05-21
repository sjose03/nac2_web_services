package br.com.fiap.financiamentos.controller;

import br.com.fiap.financiamentos.dto.Financiamento;
import br.com.fiap.financiamentos.service.impl.FinanciamentoServiceImpl;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private FinanciamentoServiceImpl service;

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView  view = new ModelAndView("home");
        List<Financiamento> financiamentos = service.listaFinanciamentos();
        view.addObject("financiamentos", financiamentos);
        return view;
    }

}
