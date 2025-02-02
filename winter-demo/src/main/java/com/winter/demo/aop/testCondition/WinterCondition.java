package com.winter.demo.aop.testCondition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:30
 */
public class WinterCondition implements Condition {
	/**
	 * Determine if the condition matches.
	 *
	 * @param context  the condition context
	 * @param metadata metadata of the {@link AnnotationMetadata class}
	 *                 or {@link MethodMetadata method} being checked
	 * @return {@code true} if the condition matches and the component can be registered,
	 * or {@code false} to veto the annotated component's registration
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if (context.getBeanFactory().containsBean("winterAspect")){
			return true;
		}
		return false;
	}
}
