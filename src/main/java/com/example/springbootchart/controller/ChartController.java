package com.example.springbootchart.controller;

import com.example.springbootchart.dto.ChartResponseDTO;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class ChartController {

    @GetMapping("/chart")
    public String chart(Model model) {

        List<ChartResponseDTO> list = new ArrayList<>();
        list.add(new ChartResponseDTO("202301", 354L));
        list.add(new ChartResponseDTO("202302", 554L));
        list.add(new ChartResponseDTO("202303", 654L));
        list.add(new ChartResponseDTO("202304", 254L));
        list.add(new ChartResponseDTO("202305", 154L));
        list.add(new ChartResponseDTO("202306",  54L));
        list.add(new ChartResponseDTO("202307", 654L));

        List<String> targetYmList = list.stream().map(ChartResponseDTO::getTargetYm).toList();
        List<Long> priceList = list.stream().map(ChartResponseDTO::getPrice).toList();

        model.addAttribute("list", list);
        model.addAttribute("targetYmList", targetYmList);
        model.addAttribute("priceList", priceList);

//
//        String[] targetYmArray = list.stream().map(ChartResponseDTO::getTargetYm).toArray(String[]::new);
//        Long[] priceArray = list.stream().map(ChartResponseDTO::getPrice).toArray(Long[]::new);
//
//        log.info("list: {}", list);
//        log.info("targetYmArray: {}", (Object) targetYmArray);
//        log.info("priceArray: {}", (Object) priceArray);
//
//
//        model.addAttribute("list", list);
//        model.addAttribute("targetYmArray", targetYmArray);
//        model.addAttribute("priceArray", priceArray);

        return "chart";
    }

}
