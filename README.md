README
# Prosit 7 - Gestion des Exceptions

## 📋 Description
Ce prosit introduit la gestion des exceptions personnalisées dans le système de gestion de zoo, permettant une meilleure gestion des erreurs et une exécution plus robuste de l'application.

## 🎯 Objectifs Pédagogiques
- Comprendre et implémenter les exceptions personnalisées
- Gérer les situations exceptionnelles sans interrompre le programme
- Séparer la logique métier de la gestion des erreurs
- Valider les données avec des mécanismes d'exception

## 📁 Structure du Projet
tn/
└── esprit/
└── gestionzoo/
├── entities/
│ ├── exceptions/
│ │ ├── ZooFullException.java
│ │ └── InvalidAgeException.java
│ ├── Animal.java
│ ├── Aquatic.java
│ ├── Terrestrial.java
│ ├── Dolphin.java
│ ├── Penguin.java
│ └── Zoo.java
└── main/
└── Main.java


## 🚀 Instructions Implémentées

### ✅ Instruction 32 : Simplification de la méthode addAnimal
- **Modification** : Changement du type de retour de `boolean` à `void`
- **Suppression** des vérifications internes de capacité
- **Maintenance** de l'ajout normal des animaux valides

### ✅ Instruction 33 : Exception ZooFullException
- **Création** de la classe `ZooFullException` héritant de `Exception`
- **Message** : "Le zoo est plein, impossible d'ajouter un nouvel animal."
- **Modification** de `addAnimal()` pour lever l'exception
- **Gestion** dans le main avec bloc try-catch
- **Test** avec capacité réduite à 3 cages

### ✅ Instruction 34 : Exception InvalidAgeException
- **Création** de la classe `InvalidAgeException` héritant de `Exception`
- **Message** : "Âge d'animal invalide : l'âge ne peut pas être négatif."
- **Validation** de l'âge dans `addAnimal()`
- **Gestion** dans le main avec message d'erreur explicite

