package com.winter.demo.aop.testImport;

import com.winter.demo.aop.testImport.component.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:57
 */
public class WinterBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	/**
	 * Register bean definitions as necessary based on the given annotation metadata of
	 * the importing {@code @Configuration} class.
	 * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
	 * registered here, due to lifecycle constraints related to {@code @Configuration}
	 * class processing.
	 * <p>The default implementation delegates to
	 * {@link #registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry)}.
	 *
	 * @param importingClassMetadata  annotation metadata of the importing class
	 * @param registry                current bean definition registry
	 * @param importBeanNameGenerator the bean name generator strategy for imported beans:
	 *                                {@link ConfigurationClassPostProcessor#IMPORT_BEAN_NAME_GENERATOR} by default, or a
	 *                                user-provided one if {@link ConfigurationClassPostProcessor#setBeanNameGenerator}
	 *                                has been set. In the latter case, the passed-in strategy will be the same used for
	 *                                component scanning in the containing application context (otherwise, the default
	 *                                component-scan naming strategy is {@link AnnotationBeanNameGenerator#INSTANCE}).
	 * @see ConfigurationClassPostProcessor#IMPORT_BEAN_NAME_GENERATOR
	 * @see ConfigurationClassPostProcessor#setBeanNameGenerator
	 * @since 5.2
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Cat.class);
		registry.registerBeanDefinition("cat", beanDefinition);
	}
}
