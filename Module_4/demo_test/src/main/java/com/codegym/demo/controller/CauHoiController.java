package com.codegym.demo.controller;

import com.codegym.demo.model.CauHoi;
import com.codegym.demo.service.Impl.CauHoiServiceImpl;
import com.codegym.demo.service.Impl.LoaiCauHoiServiceImpl;
import com.codegym.demo.service.Impl.NguoiDungServiceImpl;
import com.codegym.demo.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("cauhoi")
public class CauHoiController {
    @Autowired
    NguoiDungServiceImpl nguoiDungService;
    @Autowired
    LoaiCauHoiServiceImpl loaiCauHoiService;
    @Autowired
    CauHoiServiceImpl cauHoiService;

    @GetMapping
    public String getCauHoiPage(Model model, @PageableDefault(value = 5,sort = "idCauHoi",direction = Sort.Direction.DESC) Pageable pageable,
                                  @RequestParam(value = "inputSearch",defaultValue = "") String inputSearch){
        Page<CauHoi> cauHoiList;
        if("".equals(inputSearch)){
            cauHoiList=cauHoiService.findAll(pageable);
        }else {
            cauHoiList=cauHoiService.findByAll(inputSearch,pageable);
        }
        model.addAttribute("cauHoiList",cauHoiList);
        model.addAttribute("inputSearch",inputSearch);
        return "/views/list_cauHoi";
    }

    @GetMapping("/create")
    public String getCreatePage( Model model){
        model.addAttribute("cauHoi",new CauHoi());
        model.addAttribute("loaiCauHoi",loaiCauHoiService.findAll());
        model.addAttribute("nguoiDung",nguoiDungService.findAll());
        return "/views/create_cauHoi";
    }

    @PostMapping("/create")
    public String createNewCustomer(@Validated @ModelAttribute CauHoi cauHoi , BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("loaiCauHoi", loaiCauHoiService.findAll());
            model.addAttribute("nguoiDung", nguoiDungService.findAll());
            return "views/create_cauHoi";
        } else if (cauHoi.getNguoiPhanHoi().equals("N/A")) {
            cauHoi.setStatus("chophanhoi");
            cauHoiService.save(cauHoi);
        } else {
            cauHoi.setStatus("daphanhoi");
            cauHoiService.save(cauHoi);
        }
        return "redirect:/cauhoi";
    }
}
