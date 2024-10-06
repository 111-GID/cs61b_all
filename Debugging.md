#  Debugging

#### **交互式调试**
你可能已经通过打印语句进行过调试，即通过在程序运行时输出变量的值来检查状态。这种方法称为“打印调试”，但它有一些缺点，比如需要修改代码、打印内容不总是格式化得很好等。

在本实验中，你将学习一种新的调试技术——交互式调试，使用调试器工具进行调试。IntelliJ内置了调试器，使用时无需修改代码，可以直接查看变量状态，且显示内容结构化。

---

#### **调试器概览**
1. **断点（Breakpoints）**：
   - 断点用于标记程序中的某个位置，调试时程序会在此暂停，允许你检查程序状态。设置断点时，只需点击代码行号旁边的区域。
   - <img src="https://sp24.datastructur.es/labs/lab02/img/code_breakpoints.png" alt="代码断点" style="zoom:33%;" />
   
2. **运行调试器**：
   - 设置断点后，点击绿色三角形旁边的调试按钮，程序会运行至断点处并暂停。调试器窗口会显示当前方法调用和变量值。
   - <img src="https://sp24.datastructur.es/labs/lab02/img/run_debugger.png" alt="运行调试器" style="zoom:33%;" />
   
3. **调试器的功能**：<img src="https://sp24.datastructur.es/labs/lab02/img/debugger_session.png" alt="调试器会话" style="zoom:33%;" />
   - **学习**：通过查看变量值找出问题并修复错误。
   - **继续运行**：点击继续按钮，程序会运行至下一个断点或结束。
   - **逐步执行**：可以逐行调试代码。
   - **进入方法**：如果当前行有方法调用，点击进入按钮可以进入该方法查看执行过程。
   - **退出方法**：执行完当前方法后返回上层调用。

如果调试过程中操作过度，可以通过重新运行按钮重新开始调试

---

#### **可视化工具**
在这一阶段，我们会使用`IntList`类。在调试长的`IntList`时，使用Java可视化工具（Visualizer）更为合适，它可以生成更直观的图表。

```
IntList lst = new IntList(1, new IntList(2, new IntList(3, null)));
```

- **`IntList.of`方法**：可以方便地创建`IntList`对象，比如`IntList.of(1, 2, 3)`比手动创建更简洁。

  ```
  IntList lst = IntList.of(1, 2, 3);
  
      public boolean equals(Object other) {
          if (other instanceof IntList oL) {
              if (first != oL.first) {
                  return false;
              } else if (rest == null && oL.rest == null) {
                  return true;
              } else if (rest != null && oL.rest != null) {
                  return rest.equals(oL.rest);
              } else {
                  return false;
              }
          }
          return false;
      }
  ```

- **`IntList.print`方法**：可以打印`IntList`的字符串表示形式。

  ```
  IntList lst = IntList.of(1, 2, 3);
  System.out.println(lst.print())
  // Output: 1 -> 2 -> 3
  
  public String print() {
          if (rest == null) {
              // Converts an Integer to a String!
              return String.valueOf(first);
          } else {
              return first + " -> " + rest.print();
          }
      }
  ```

- 设置断点在`phase1`方法，并使用Java可视化工具找到`phase1`的密码，将其替换到BombMain.java中。可以通过`testBombPhase1`进行测试。

---

#### **条件断点**
有时候你需要程序在特定条件下暂停，比如在某个循环的特定迭代次数上。此时可以使用**条件断点**，只在特定条件下暂停程序。右键点击断点图标，选择“编辑断点”，可以设置布尔条件。

<img src="https://sp24.datastructur.es/labs/lab02/img/conditional_breakpoint.png" alt="条件断点" style="zoom:33%;" />

![查看断点](https://sp24.datastructur.es/labs/lab02/img/view-breakpoints.png)调试器窗口并按加号图标以创建“Java 异常断点”，在应出现的窗口中，输入程序抛出的异常的名称。

- 设置断点在`phase2`方法，使用条件断点找到`phase2`的密码并将其替换到BombMain.java中。
- **`phase2`方法分析**：此方法会将10万个随机整数添加到集合`Set`中，并在第1338次迭代时检查你的密码是否与当前数字相等。你需要通过条件断点找出正确的密码。

