package com.csaszarteam.fileuploader.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.io.File;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {

		// upload temp file will put here
		File uploadDirectory = new File(System.getProperty("java.io.tmpdir"));

		// register a MultipartConfigElement
		MultipartConfigElement multipartConfigElement =
				new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
						maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

		registration.setMultipartConfig(multipartConfigElement);

	}

	@Override
	protected DispatcherServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
		final DispatcherServlet dispatcherServlet = (DispatcherServlet) super.createDispatcherServlet(servletAppContext);
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
		return dispatcherServlet;
	}

}

/*
private String TMP_FOLDER = "/tmp";
	private int MAX_UPLOAD_SIZE = 5 * 1024 * 1024;

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		AnnotationConfigWebApplicationContext root =
				new AnnotationConfigWebApplicationContext();

		root.scan("com.csaszarteam.fileuploader");
		sc.addListener(new ContextLoaderListener(root));

		ServletRegistration.Dynamic appServlet =
				sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");

		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(TMP_FOLDER,
				MAX_UPLOAD_SIZE, MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);

		appServlet.setMultipartConfig(multipartConfigElement);
	}
 */






