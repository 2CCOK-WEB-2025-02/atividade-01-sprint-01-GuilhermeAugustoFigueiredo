package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        Boolean resultado = true;
        String palavraFormatada = palavra.toLowerCase();

        for (int i = 0; i < palavra.length() / 2; i++) {
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() -1 -i);

            if (a != b){
                resultado = false;
            }
        }

        return resultado;
    }
}
