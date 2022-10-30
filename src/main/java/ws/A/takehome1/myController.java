/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.A.takehome1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author akmal
 */

@Controller
public class myController {
    @RequestMapping("/takehome")
    @ResponseBody
    
    public String Inputan
        (
            @RequestParam(value="Nama") String inputNama,
            @RequestParam(value="Lokasi") String inputLokasi
        )
    {
        return "viewpage";
    }
}
