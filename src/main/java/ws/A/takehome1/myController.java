/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.A.takehome1;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author akmal
 */

@Controller
public class myController {
    @RequestMapping("/takehome")
    public String Inputan
        (
            @RequestParam(value="Nama") String inputNama,
            @RequestParam(value="Lokasi") String inputLokasi,
            @RequestParam(value="Gambar") MultipartFile inputGambar,
            Model input
        ) throws IOException
        
        {
            byte[] img  = inputGambar.getBytes();
            String base64Image = Base64.encodeBase64String(img);
            String LinkImg = "data:image/png;base64,".concat(base64Image);
            input.addAttribute("Nama1", inputNama);
            input.addAttribute("Lokasi1", inputLokasi);
            input.addAttribute("Gambar1", LinkImg);
            return "view";
        }
}