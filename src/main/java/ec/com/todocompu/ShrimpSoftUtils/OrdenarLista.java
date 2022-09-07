package ec.com.todocompu.ShrimpSoftUtils;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

public class OrdenarLista {

	@SuppressWarnings("unchecked")
	public static <T> void ordena(List<T> lista, String propiedad) {
		lista.sort(new Comparator<T>() {
			public int compare(Object o1, Object o2) {
				Class clase = o1.getClass();
				String getter = "get" + Character.toUpperCase(propiedad.charAt(0)) + propiedad.substring(1);
				try {
					Method getPropiedad = clase.getMethod(getter);
					Object propiedad1 = getPropiedad.invoke(o1);
					Object propiedad2 = getPropiedad.invoke(o2);
					if (propiedad1 instanceof Comparable && propiedad2 instanceof Comparable) {
						Comparable comp1 = (Comparable) propiedad1;
						Comparable comp2 = (Comparable) propiedad2;
						return comp1.compareTo(comp2);
					} else if (propiedad1.equals(propiedad2))
						return 0;
					else
						return 1;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
	}
}
