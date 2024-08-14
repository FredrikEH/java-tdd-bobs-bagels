
| Classes  | Variables                    | Methods                | Scenario                                | Outcomes                             |
|----------|------------------------------|------------------------|-----------------------------------------|--------------------------------------|
| `Basket` | `List<String> bagels`        | `order(String bagel)`  | If bagels contains bagel                | Increase total price and return true |
|          | `List<String> orderedBagels` |                        | If bagels does not contain bagel        | Print error message and return false |
|          | `int capacity`               | `remove(String bagel)` | If orderedBagels contains bagel         | Reduce total price                   |
|          |                              |                        | If orderedBagels does not contain bagel | Print error message                  |
|          |                              | `full()`               | If orderedBagels is full                | Print basket is full message         |
|          |                              |                        | If orderedBagels is not full            | Print basket is not full message     |
|          |                              | `capacity(int i)`      |                                         | Capacity is changed                  |