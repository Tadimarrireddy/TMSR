
TMSR Full Website - Spring Boot + Thymeleaf (STS-ready)
-------------------------------------------------------

How to import & run in STS (Spring Tool Suite):

1. Unzip the project folder.
2. In STS: File -> Import -> Maven -> Existing Maven Projects.
3. Select the folder where pom.xml is located and finish import.
4. Wait for Maven dependencies to download.
5. Run the application:
   - Right click on 'TmsrStsFullsiteApplication.java' -> Run As -> Spring Boot App
6. Open browser: http://localhost:8080/

Features:
- Pages: Home, About, Services, Technologies, RealEstate, FAQ, Contact
- Contact form posts to /contact and shows a thank-you page.
- /api/info returns JSON with company info.
- Embedded SVG images used as placeholders for "free stock" visuals.
- Static CSS included under /src/main/resources/static/css/styles.css
