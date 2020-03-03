# pglp_3.3

### Exercice 3.3 (Illustration du principe de substitution de Liskov (LSP))

1. Cette solution respecte-t-elle LSP ? Pourquoi ?
2. Implémentez la méthode avancerTous qui fait avancer tous les robots.
3. Proposez une solution respectant LSP

1. Non on a ajouté throw new Exception dans le robot statique qui n'existe pas de la classe robot, on viole LSP.