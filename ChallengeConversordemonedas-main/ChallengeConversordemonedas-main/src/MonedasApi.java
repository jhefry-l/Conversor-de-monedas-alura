// Clase record con las variables de la api

public record MonedasApi(String base_code,
                         String target_code,
                         double conversion_rate,
                         double conversion_result) {
}
