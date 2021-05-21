package br.com.fiap.financiamentos.controller;

import br.com.fiap.financiamentos.dto.Financiamento;
import br.com.fiap.financiamentos.service.impl.FinanciamentoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class IntentionController {
    @Autowired
    FinanciamentoServiceImpl service;

    @GetMapping("nova-intention")
    public ModelAndView Homeintention() {
        ModelAndView view = new ModelAndView("intention");
        view.addObject(new Financiamento());
        return view;
    }

    @PostMapping("salvar-financiamento")
    public String salvarFinanciamento(@Valid Financiamento financiamento, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute(financiamento);
            return "intention";
        }
        else{
            service.salvaFinanciamento(financiamento);
            return "redirect:/";
        }
    }


    @GetMapping("/financiamento/{id}")
    public ModelAndView editarProduto(@PathVariable Long id) {
        ModelAndView view = new ModelAndView("intention");
        Financiamento financiamento = service.editarFinanciamento(id);
        view.addObject("financiamento", financiamento);
        return view;
    }
}
