package echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

  private static final int count = Integer.parseInt(System.getProperty("noop.count", "1"));

  @RequestMapping("/echo")
  public String echo(@RequestParam String name) {
    for (int i = 0; i < count; i++) {
      noop();
    }

    return name;
  }

  private void noop() {
  }
}
