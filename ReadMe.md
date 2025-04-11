# Cours TP Séances 1 2 3:
Cette repository inclut le contenu du code progressive l'avancement des TP du cours Developpement web avec Java (ancienement JEE) pour les étudiant de S4 du SupNum

### Installation et configuration : 
Pour le context de ce cours nous allons travailler les outils suivantes : 
* VS Code : Comme editeur de texte (Ces raccourcis et la modularité des plugin le rend une nécessité aujourd'hui)
* Java : assurer vous que vous avez une version java compatible (version supportées : 23, 21 ou 17) sur votre PC.
* Assurer que java est detecté comme un variable globale (la commande `java --version` devrais afficher la version java que vous avez)

* Assurer vous que vous avez installer les plugins suivantes sur votre vscode : 
  * `Java IDE Pack` (ce pack contient 13 plugins)
  * `Extension Pack for Java`  (ce pack contient 9 plugins)
  * `Spring Boot Extension Pack`  (ce pack contient 3 plugins)

### Crée Votre premier projet : 

* Dans VSCode ouvrez la palette de commandes (Ctr + shift + P)
* Chercher l'option `Spring initializr : Create a Maven Project`
* Specifier une version (peux importe) ex : 3.3.9
* Choisiser Java
* Ajouter un nom pour votre package ex : example.com
* Ajouter un nom pour votre application ex : demo
* Choisiser le type de packaging de votre application : préférablement `jar`
* Spécifier la version java que vous avez installé : ex 23
* Choisissez les dependences que vous allez utiliser : 
  * Ceci est variable en fonction de notre avancement dans le cours, pour le premier TP
    * Ajouter `Spring Web` et `Thymeleaf`
* Taper sur entrer après VS Code va vous indiquer une boite de dilague indicant que votre projet est crée dans un nouvea dossier et vous offre l'option d'y ouvrir dans une nouvelle fenètre, clicker sur ouvrir.

* Executer votre projet en clicant sur le bouton run (parmi les section dans la bare de navigation à gauche)

### Comment re-utiliser le module d'authentification jwtModule dans votre projet :
* copier les dependences nécessaires pour le fonctionnement de ce module  dans votre `pom.xml`
  ```xml
    <!-- #Region : Spring Security-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- ? to use instead of the deprecated jjwt, now we use three dependcies instead of the one
		bundled one-->
		<!-- JWT API -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.12.6</version>
		</dependency>

		<!-- JWT implementation -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.12.6</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.12.6</version>
		</dependency>
		
		<!-- #endregion Spring security-->
  ```

  * Sauvegarder votre `pom.xml` après l'ajout des dependences (ceci devrait telecharger les dependences)
  * Copier le dossier du module `jwtModule` dans le dossier de votre projet (le dossier contenant le fichier main)
  * Assurer que tout fonctionne bien que les librairies dans le copie etaient les bonnes.
  * Si tout est ok vous pouvez l'utiliser maintenant et le customiser à votre besoin.
  