import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpatterns.creational.abstractfactory.ShapeFactory;
import com.designpatterns.creational.abstractfactory.ShapeFactoryMaker;
import com.designpatterns.creational.abstractfactory.ShapeFactoryMaker.ShapeFactoryType;
import com.designpatterns.creational.builder.AnyShape;
import com.designpatterns.creational.builder.Shape2DBuilder;
import com.designpatterns.creational.builder.ShapeBuilder;
import com.designpatterns.creational.builder.Shapes;
import com.designpatterns.creational.factorymethod.Shape2DFactory;
import com.designpatterns.creational.singleton.MySingleton;
import com.designpatterns.models.Shape;

public class Main {
//	 private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
//		singletonDemo();
//		 factoryMethodDemo();
//		 abstractFactoryDemo();
		 builderDemo();
	}

	private static void singletonDemo() {
		System.out.println("======Singleton Demo======");

		MySingleton mySingleton1 = MySingleton.getInstance();
		MySingleton mySingleton2 = MySingleton.getInstance();

		System.out.println("Does mySingleton1 equals mySingleton2? " + mySingleton1.equals(mySingleton2));

		// Java API Examples
		// java.lang.Runtime#getRuntime()
		// java.awt.Desktop#getDesktop()
		// java.lang.System#getSecurityManager()
	}

	private static void factoryMethodDemo() {
		System.out.println("\n======Factory Method Demo======");

		Shape2DFactory shapeFactory = new Shape2DFactory();

		// get an object of Circle and call its draw method.
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		// get an object of Rectangle and call its draw method.
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		// get an object of Square and call its draw method.
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		// Java API Examples
//		 LOGGER.info("======Factory Method Demo======");

		// java.util.Calendar.createCalendar(TimeZone, Locale)
		// java.util.ResourceBundle.getBundle(...)
		// java.text.NumberFormat.getInstance(...)
		// java.nio.charset.Charset
		// java.net.URLStreamHandlerFactory
		// java.util.EnumSet
		// javax.xml.bind.JAXBContext
	}

	private static void abstractFactoryDemo() {
		System.out.println("\n======Abstract Factory Method Demo======");

		ShapeFactory shape2DFactory = ShapeFactoryMaker.makeFactory(ShapeFactoryType.SHAPE2D);
		shape2DFactory.getRoundShape().draw();//circle
		shape2DFactory.getSquaredShape().draw();//square

		ShapeFactory shape3DFactory = ShapeFactoryMaker.makeFactory(ShapeFactoryType.SHAPE3D);
		shape3DFactory.getRoundShape().draw();//sphere
		shape3DFactory.getSquaredShape().draw();//cube

		// Java API Examples
		// javax.xml.parsers.DocumentBuilderFactory
		// javax.xml.transform.TransformerFactory
		// javax.xml.xpath.XPathFactory
	}

	private static void builderDemo() {
		System.out.println("\n======Builder Demo======");
		Shapes shapes = new Shapes();
		ShapeBuilder shapeBuilder = new Shape2DBuilder();
		AnyShape myShape = shapes.createShapes(shapeBuilder);

		// Java API Examples
		// java.lang.StringBuilder
		// java.nio.ByteBuffer as well as similar buffers such as FloatBuffer, IntBuffer
		// and so on.
		// java.lang.StringBuffer

	}

}
