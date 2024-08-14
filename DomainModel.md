
| Classes  | Variables                         | Methods                | Scenario                                | Outcomes            |
|----------|-----------------------------------|------------------------|-----------------------------------------|---------------------|
| `Basket` | `ArrayList<String> bagels`        | `order(String bagel)`  | If bagels contains bagel                | Return true         |
|          | `ArrayList<String> orderedBagels` |                        | If bagels does not contain bagel        | Return false        |
|          | `int capacity`                    | `remove(String bagel)` | If orderedBagels contains bagel         | Return true         |
|          |                                   |                        | If orderedBagels does not contain bagel | Return false        |
|          |                                   | `full()`               | If orderedBagels is full                | Return true         |
|          |                                   |                        | If orderedBagels is not full            | Return false        |
|          |                                   | `setCapacity(int i)`   |                                         | Capacity is changed |