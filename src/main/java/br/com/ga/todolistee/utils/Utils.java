package br.com.ga.todolistee.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;




// classe Utils, pra reutilizar em outros momentos
public class Utils {
    public static void copyNonNullProperties(Object source, Object target) {
      BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }
  
    public static String[] getNullPropertyNames(Object source) {

        final BeanWrapper src = new BeanWrapperImpl(source); // Interface que fornece uma forma de acessar as propriedades de um objeto dentro do java

        PropertyDescriptor[] pds = src.getPropertyDescriptors(); // pega as propriedades de valores nulos

        Set<String> emptyNames = new HashSet<>();

    for (PropertyDescriptor pd : pds) {
      Object srcValue = src.getPropertyValue(pd.getName());
      if (srcValue == null) {
        emptyNames.add(pd.getName());
      }
    }

    String[] result = new String[emptyNames.size()];
    return emptyNames.toArray(result);
  }
}