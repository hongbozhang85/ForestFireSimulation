## Issues
+ Interface Show, ShowTreeLotFire/NoFire/SomeFire/Burnt. lots of duplicated code. I think it should be like this:
	```Java
	abstract class Show extends ImageView ...
	ShowTreeLotFire extends Show
	```
	in this case, the `Cartesian position`, method `hideFigure` and `showFigure` in ShowTreeLotFire/NoFire/SomeFire/Burnt will not be duplicated.
+ In class Tree and class Ember, the `radius` inherited from class Item is duplicated with  `SIZE_TREE` and `SIZE_EMBER` in Interface Show.
+ In class Trees and class Embers, the `WIDTH` and `HEIGHT` are duplicated with them in class Board.
+ Why do I use superclass Item? It seems that it doesn't simplify the problem too much.
+ In Trees, a tree can overlap with other tree.
+ Should the method `showAllFigures` be presented in class Forest or class Board?
+ When embers go out of canvas, remove it from root.getChildren()

## Notes
+ If one want to call method in constructor, that method must be static. So any field can not be used directly. 
  For example, in Class Trees, we want to check whether trees in non-static field `treesArray` are overlap with 
  each other in constructor. We need a method `static boolean tooClose(double x, double y)`. 
  However, this method will not work, since in this method non-static field `treesArray` will be used, but it can
   not used in static method. So the solution to this problem is very easy. Using `static boolean tooClose(x,y,treesArray)`.
+ "It seems that `showFigure` is not necessary, since everything relevant to `showFigure` can be put in constructor." This statement
  is totally incorrect! If I put `showFigure` in constructor, then this image cannot move in an animation, since once the instance of
  the image is created, its position is fixed. However, if we use a method `showFigure`, then once `Showxxx.position` updates, we can 
  call `showFigure` immediately, so its position will change correspondingly.