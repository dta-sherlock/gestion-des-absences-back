INSERT INTO `utilisateur` (`id`, `nom`, `prenom`, `email`, `mdp`, `grade`, `solde_conges`, `solde_rtt`) VALUES
  (NULL, 'Tourrilhes', 'Géraud', 'manager@gmail.com',
   '6ee4a469cd4e91053847f5d3fcb61dbcc91e8f0ef10be7748da4c4a1ba382d17', 'Manager', '10', '10'),
  (NULL, 'Dimper', 'Olivier', 'admin@gmail.com', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918',
   'Administrateur', '20', '20'),
  (NULL, 'Lauret', 'Sony', 'employe@gmail.com', '11c27ae42d9214f220eb0918855cbfcde8767d43d0db9efcfc21f018770d2fd6',
   'Employé', '5', '5'),
  (NULL, 'Wojtasiak', 'Quentin', 'employe1@gmail.com',
   '11c27ae42d9214f220eb0918855cbfcde8767d43d0db9efcfc21f018770d2fd6', 'Employé', '5', '5');

INSERT INTO `absence` (`id`, `date_debut`, `date_fin`, `motif`, `type`, `statut`, `id_utilisateur`) VALUES
  (NULL, '2018-06-21', '2018-06-22', 'match france', 'congé payé', 'Validée', '3'),
  (NULL, '2018-06-20', '2018-06-22', 'vacance', 'RTT', 'En_Attente_Validation', '1'),
  (NULL, '2018-06-25', '2018-06-29', 'malade', 'congé sans solde', 'Rejetée', '2');

INSERT INTO `rtt` (`id`, `date`, `commentaire`, `type`, `statut`) VALUES
  (NULL, '2018/06/21', 'Match de l\'équipe de France pour la coupe du monde.', 'RTT employeur', 'Validée');

INSERT INTO `ferie` (`id`, `date`, `commentaire`, `type`) VALUES
  (NULL, '2018/07/14', 'Fête nationale.', 'Férié');