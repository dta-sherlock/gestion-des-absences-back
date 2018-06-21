DROP TABLE IF EXISTS `Utilisateur`;
CREATE TABLE `Utilisateur`
(
  `id`     INT                                           NOT NULL AUTO_INCREMENT,
  `nom`    VARCHAR(30)                                   NOT NULL,
  `prenom` VARCHAR(30)                                   NOT NULL,
  `email`  VARCHAR(30)                                   NOT NULL,
  `mdp`    VARCHAR(30)                                   NOT NULL,
  `grade`  ENUM ('Administrateur', 'Manager', 'Employé') NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB;
ALTER TABLE `utilisateur`
  ADD `solde_conges` INT NULL
  AFTER `grade`,
  ADD `solde_rtt` INT NULL
  AFTER `solde_conges`;

DROP TABLE IF EXISTS `Absence`;
CREATE TABLE `Absence` (
  `id`             INT                                                              NOT NULL AUTO_INCREMENT,
  `date_debut`     DATE                                                             NOT NULL,
  `date_fin`       DATE                                                             NOT NULL,
  `motif`          VARCHAR(30)                                                      NOT NULL,
  `type`           ENUM ('congé payé', 'RTT', 'congé sans solde', 'mission')        NOT NULL,
  `statut`         ENUM ('Initiale', 'En_Attente_Validation', 'Validée', 'Rejetée') NOT NULL,
  `id_utilisateur` INT                                                              NOT NULL,
  PRIMARY KEY (`id`),
  INDEX (`id_utilisateur`),
  FOREIGN KEY (`id_utilisateur`) REFERENCES utilisateur (`id`)
)
  ENGINE = InnoDB;

DROP TABLE IF EXISTS `rtt`;

CREATE TABLE `gestion_des_absences`.`rtt` (
  `id`          INT                             NOT NULL AUTO_INCREMENT,
  `date`        DATE                            NOT NULL,
  `commentaire` TEXT                            NOT NULL,
  `type`        ENUM ('RTT employeur', 'Férié') NOT NULL,
  `statut`      ENUM ('Initiale', 'Validée')    NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB;

DROP TABLE IF EXISTS `ferie`;
CREATE TABLE `gestion_des_absences`.`ferie` (
  `id`          INT                             NOT NULL AUTO_INCREMENT,
  `date`        DATE                            NOT NULL,
  `commentaire` TEXT                            NOT NULL,
  `type`        ENUM ('RTT employeur', 'Férié') NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB;


DROP TABLE IF EXISTS `version`;
CREATE TABLE `version` (
  `id`                int(11) NOT NULL,
  `date_time_created` tinyblob,
  `git_version`       varchar(255) DEFAULT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
