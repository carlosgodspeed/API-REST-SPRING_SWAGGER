package dio.my_rest_api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    private Contact contato() {
        return new Contact()
                .name("Seu nome")
                .url("https://www.linkedin.com/in/seu-perfil")
                .email("seu.email@exemplo.com");
    }

    private Info informacoesApi() {

        Info info = new Info();

        info.title("Title - My REST API");
        info.description("API de exemplo para demonstração do Swagger");
        info.version("1.0");
        info.termsOfService("Termo de uso: Open Source");
        info.license(new License()
                .name("Licença - Sua Empresa")
                .url("https://www.suaempresa.com"));
        info.contact(this.contato());

        return info;
    }

    @Bean
    public OpenAPI detalheApi() {

        OpenAPI openAPI = new OpenAPI();
        openAPI.info(this.informacoesApi());

        return openAPI;
    }
}