package com.winter.demo.aop.testImport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:50
 */
public class WinterImportSelector implements ImportSelector {
	/**
	 * Select and return the names of which class(es) should be imported based on
	 * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
	 *
	 * @param importingClassMetadata
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.winter.demo.aop.testImport.component.Dog"};
	}
}
