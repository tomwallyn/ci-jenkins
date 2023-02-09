# TP-CI
Voici les étapes à suivre pour lancer notre CI jenkins:

Lancez les services : Ouvrez une fenêtre de terminal, accédez au répertoire où se trouve le fichier docker-compose.yml, puis exécutez la commande suivante pour lancer les services :

```docker-compose up -d```

Cela va lancer les trois services (Jenkins, Nexus et SonarQube) en arrière-plan. Les options -d permettent de lancer les services en mode détaché, ce qui signifie que le terminal reste libre pour exécuter d'autres commandes.

Accédez à l'interface web de Jenkins : Ouvrez un navigateur web et accédez à l'URL http://localhost:8080. Cela devrait afficher l'interface web de Jenkins.

Configurez Jenkins : Suivez les étapes de configuration de Jenkins pour créer un utilisateur administrateur, installer les plugins nécessaires, configurer les outils et les agents d'exécution, et créer un pipeline Jenkins.

Lancer le pipeline : Une fois que le pipeline est créé, vous pouvez le lancer en cliquant sur le bouton "Build Now" dans l'interface web de Jenkins. Le pipeline commencera à s'exécuter en suivant les étapes définies dans le Jenkinsfile.

Accédez à l'interface web de Nexus : Ouvrez un navigateur web et accédez à l'URL http://localhost:8081. Cela devrait afficher l'interface web de Nexus.

Accédez à l'interface web de SonarQube : Ouvrez un navigateur web et accédez à l'URL http://localhost:9000. Cela devrait afficher l'interface web de SonarQube.

C'est tout ! Si tout est configuré correctement, le pipeline devrait s'exécuter avec succès et publier le package JAR sur le serveur Nexus. Vous pouvez également utiliser SonarQube pour analyser la qualité du code source et obtenir des informations sur les problèmes potentiels.


