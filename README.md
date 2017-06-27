# imc REST

Laboratório da turma de Programação para Web, UFG 2017.

Pagina de calculo de IMC usando arquitetura MVC e maven.

## Para rodar o projeto

### Para fazer clone.

`git clone https://github.com/higoros/imc-mvc`

### Para rodar com o Tomcat.

Rodar o servidor na porta padrão configurada no pom.xml :9090

`mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run`

É possivel rodar o servidor em uma porta alternativa configurando o ultimo atributo 

`mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=8181`

No Linux, use `./mvn` ao invés de apenas `mvnw`, como no Windows. Além disso, pelo menos uma vez, é preciso dar permissão de execução ao arquivo de script **mvnw** com o comando `chmod +x mvnw`.

## Para acessar a aplicação

`http://localhost:9090/imc-mvc` em qualquer navegador.

### Para "empacotar" a aplicação.

`mvnw package`

## Para "preparar" o projeto

### Para "embutir" o Maven no projeto.

Não precisa fazer isso! Já foi feito. :)

`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`