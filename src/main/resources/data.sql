-- Initialisation des tables
INSERT INTO Employe(matricule, montant_prime, pourcentage,superieur_matricule, dtype, diplome, email, nom) VALUES
    (1, null, 0.2, null,'Commercial', null, 'Remi.Bastide@univ-jfc.fr','Rémi Bastide'), -- Les clés sont auto-générées
    (2, null, null, null, 'Administratif', 'Master', 'Elyes.Lamine@univ-jfc.fr', 'Elyes Lamine'),
    (3, 200, null, null, 'Technique', null, 'United States of America', 'Jean-Marie Pécatte');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;

INSERT INTO Employe(matricule, montant_prime, pourcentage,superieur_matricule, dtype, diplome, email, nom) VALUES
    (default, null, 0.4, 1,'Commercial', null, 'JeanK@univ-jfc.fr','Jean Kevin'),
    (default, 150, null, 3, 'Technique', null, 'Pierre.menu@univ-jfc.fr', 'Pierre Menu'),
    (default, null, null, 2, 'Administratif', 'DUT', 'byebye.manu@univ-jfc.fr', 'Manu Ciao');
    
INSERT INTO Projet(code, debut, fin, nom) VALUES
(default, '2023-01-27', null, 'calcul'),
(default, '2021-01-27', '2022-05-08', 'budget'),
(default, '2023-01-01', null, 'vente'),
(default, '2022-04-27', '2023-08-16', 'restructuration'); 

INSERT INTO Participation(affectation_code, contributeur_matricule, id, pourcentage, role) VALUES
(1,2,default,0.2,'chef'),
(1,6,default,0.8,'excecutant'),
(2,4,default,1,'excecutant'),
(3,2,default,0.6,'excecutant'),
(4,5,default,0.5,'chef');