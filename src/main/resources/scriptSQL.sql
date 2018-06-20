 INSERT INTO `utilisateur` (`id`, `email`, `mdp`, `grade`, `solde_conges`, `solde_rtt`) VALUES
 (NULL, 'manager@gmail.com', 'manager', 'Manager', '10', '10'),
  (NULL, 'admin@gmail.com', 'admin', 'Administrateur', '20', '20'),
   (NULL, 'employe@gmail.com', 'employe', 'Employé', '5', '5');

   INSERT INTO `absence` (`id`, `dateDebut`, `dateFin`, `motif`, `type`, `statut`, `idUtilisateur`) VALUES
   (NULL, '2018/06/21', '2018/06/22', 'match france', 'congé payé', 'Validée', '3'),
    (NULL, '2018-06-20', '2018-06-22', 'vacance', 'RTT', 'En_Attente_Validation', '1'),
     (NULL, '2018-06-25', '2018-06-29', 'malade', 'congé sans solde', 'Rejetée', '2');

     INSERT INTO `ferie_rtt` (`id`, `date`, `commentaire`, `type`, `statut`) VALUES
     (NULL, '2018/06/21', 'Match de l\'équipe de France pour la coupe du monde.', 'RTT employeur', 'Validée'),
      (NULL, '2018/07/14', 'Fête nationale.', 'Férié', NULL);