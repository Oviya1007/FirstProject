package skcet.project.Firstproject.Controller;

  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RestController;
  @RestController
public class MyController {
    @GetMapping("/info")
    public String getInfo(){
        return "Welcome";
    }
}
