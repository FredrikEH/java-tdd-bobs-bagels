
| Classes  | Variables                         | Methods                | Scenario                                | Outcomes                         |
|----------|-----------------------------------|------------------------|-----------------------------------------|----------------------------------|
| `Basket` | `ArrayList<String> bagels`        | `order(String bagel)`  | If bagels contains bagel                | Return true                      |
|          | `ArrayList<String> orderedBagels` |                        | If bagels does not contain bagel        | Return false                     |
|          | `int capacity`                    | `remove(String bagel)` | If orderedBagels contains bagel         | Return true                      |
|          |                                   |                        | If orderedBagels does not contain bagel | Return false                     |
|          |                                   | `full()`               | If orderedBagels is full                | Print basket is full message     |
|          |                                   |                        | If orderedBagels is not full            | Print basket is not full message |
|          |                                   | `capacity(int i)`      |                                         | Capacity is changed              |