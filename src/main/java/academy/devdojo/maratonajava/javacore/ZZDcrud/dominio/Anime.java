package academy.devdojo.maratonajava.javacore.ZZDcrud.dominio;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer producer;
}
