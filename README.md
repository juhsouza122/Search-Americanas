
**Como rodar o projeto**:

**Especificações**: 
* **Java:** versão 17
* **Spring Boot:** versão 2.4.5
* **Selenium:** versão 4.1.2
* **Maven:** versão 4.0.0


**Drive:**

Após clonar o projeto, verifique qual é o sistema operacional da sua máquina e a versao do Google Chrome.
Para verificar a versão do Google Chrome, segue abaixo o passo a passo:

**1.** Três pontinhos no canto superior direito -> Ajuda -> Sobre o Google Chrome
<img width="802" alt="Captura de Tela 2022-11-24 às 13 53 08" src="https://user-images.githubusercontent.com/52137073/203835131-d13bca86-5472-4e20-a4fd-a74bce213bd5.png">

**2.** Versão...
<img width="1115" alt="Captura de Tela 2022-11-24 às 13 54 52" src="https://user-images.githubusercontent.com/52137073/203835354-34142728-6e03-4891-ab03-26da881dd0dc.png">

Após verificar a versão do Google Chrome, entre no link abaixo e clique no drive que for compatível com a sua versão do Google:
https://chromedriver.chromium.org/downloads

Quando clicar no link ele irá mostrar os drives de acordo com o sistema operacional da sua máquina, após isso, faça download do zip compatível com o seu sistema operacional:
<img width="780" alt="Captura de Tela 2022-11-24 às 13 57 51" src="https://user-images.githubusercontent.com/52137073/203835846-187cc829-eebd-44ef-a445-c5a463718719.png">

Após isso, entre na IDE de sua preferência, vá no caminho: search-americanas/src/main/resources/drives exclua o drive que estiver lá e coloque o que você realizou download, após isso vai no caminho: search-americanas/src/main/java/com/exemple/demo/webscrapings e vá no arquivo HelperWebScraping e na linha 14 altere o caminho, por exemplo:
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    
Após essa alteração pode rodar a aplicação normalmente no localhost:8080.

* **Primeira tela**:
<img width="1440" alt="Captura de Tela 2022-11-24 às 14 10 15" src="https://user-images.githubusercontent.com/52137073/203837650-16703397-43e1-4a62-aa78-0bc85e4c8cd4.png">

* **Quando clicar no botão, ele efetua a consulta:**
<img width="1440" alt="Captura de Tela 2022-11-24 às 14 11 48" src="https://user-images.githubusercontent.com/52137073/203837890-a07d9537-a350-4891-a510-0b5c3ec2cef2.png">

