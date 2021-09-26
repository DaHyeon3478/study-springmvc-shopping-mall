package study.shoppingmall.sample.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.shoppingmall.entity.sample.SampleTable;
import study.shoppingmall.sample.service.SampleService;

import java.util.List;

// /main/... 으로 주소 정해주세요
@Controller
@RequiredArgsConstructor
@Slf4j
public class Main_Controller {

    @Autowired
    private final SampleService sampleService;

    //메인 form
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String HomeController(Model model, @ModelAttribute SampleTable sample){
        log.info("home controller");

        if(sample == null){
            log.info("home controller insert form");
            //model.addAttribute("sampleTable", new SampleTable());

        }else if(!"".equals(sample.getSamplePk()) && sample.getSamplePk() != null){ //수정
            log.info("home controller update form " + +sample.getSamplePk());
            model.addAttribute("sampleTable", sampleService.findOne(sample.getSamplePk()));
        }

        return "sample/home";
    }

    //select
    @GetMapping("/sample/list")
    public String SampleList (Model model ){
        log.info("Main_Controller SampleList..");
        List<SampleTable> sampleTable = sampleService.findSampleTable();

        model.addAttribute("sampleTable",sampleTable);
        return "sample/list";
    }
    //insert, update
    @RequestMapping(value="/new/sample")
    public String SampleNew (Model model , @ModelAttribute SampleTable sampleTable){
        log.info("Main_Controller SampleNew.." + sampleTable.toString());
        if(sampleTable != null ){
            log.info("SampleNew insert");
            //log.info(sampleTable.getSampleName());
            //log.info(sampleTable.getSampleId());
        }else{
            log.info("SampleNew update" + String.valueOf(sampleTable.getSamplePk()));
        }
        sampleService.join(sampleTable);
        return "redirect:/";
    }
    
    //delete
    @GetMapping("/sample/delete")
    public String SampleDelete (Model model, @ModelAttribute SampleTable sampleTable){
        log.info("Main_Controller delete.." + sampleTable.getSamplePk());
        sampleService.deleteById(sampleTable);
        return "redirect:/";
    }
}
