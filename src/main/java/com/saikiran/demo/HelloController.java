package com.saikiran.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "redirect:/hello";
    }

    @GetMapping("/hello")
    @org.springframework.web.bind.annotation.ResponseBody
    public String hello() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Java Web Application</title>

            <style>
                * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                }

                body {
                    font-family: Arial, sans-serif;
                    min-height: 100vh;
                    background: linear-gradient(135deg, #0f172a, #1e3a8a);
                    color: white;
                }

                .navbar {
                    height: 70px;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    padding: 0 8%;
                    background: rgba(0, 0, 0, 0.25);
                }

                .logo {
                    font-size: 26px;
                    font-weight: bold;
                }

                .logo span {
                    color: #38bdf8;
                }

                .nav a {
                    color: white;
                    text-decoration: none;
                    margin-left: 30px;
                }

                .nav a:hover {
                    color: #38bdf8;
                }

                .hero {
                    min-height: calc(100vh - 70px);
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    text-align: center;
                    padding: 40px;
                }

                .content {
                    max-width: 800px;
                }

                .badge {
                    display: inline-block;
                    padding: 8px 18px;
                    border-radius: 30px;
                    background: rgba(56, 189, 248, 0.15);
                    color: #38bdf8;
                    margin-bottom: 25px;
                    font-size: 14px;
                }

                h1 {
                    font-size: 60px;
                    margin-bottom: 20px;
                }

                h1 span {
                    color: #38bdf8;
                }

                .description {
                    color: #cbd5e1;
                    font-size: 19px;
                    line-height: 1.7;
                    margin-bottom: 35px;
                }

                .buttons {
                    display: flex;
                    justify-content: center;
                    gap: 15px;
                }

                .btn {
                    padding: 14px 28px;
                    border-radius: 8px;
                    text-decoration: none;
                    font-weight: bold;
                }

                .primary {
                    background: #38bdf8;
                    color: #0f172a;
                }

                .secondary {
                    border: 1px solid #38bdf8;
                    color: #38bdf8;
                }

                .primary:hover,
                .secondary:hover {
                    transform: translateY(-3px);
                }

                .cards {
                    display: flex;
                    justify-content: center;
                    gap: 20px;
                    margin-top: 50px;
                }

                .card {
                    width: 200px;
                    padding: 25px;
                    background: rgba(255, 255, 255, 0.08);
                    border: 1px solid rgba(255, 255, 255, 0.1);
                    border-radius: 12px;
                }

                .card h3 {
                    margin-bottom: 10px;
                    color: #38bdf8;
                }

                .card p {
                    color: #cbd5e1;
                    font-size: 14px;
                    line-height: 1.5;
                }

                footer {
                    margin-top: 40px;
                    color: #94a3b8;
                    font-size: 14px;
                }

                @media (max-width: 700px) {
                    h1 {
                        font-size: 40px;
                    }

                    .nav {
                        display: none;
                    }

                    .cards {
                        flex-direction: column;
                        align-items: center;
                    }
                }
            </style>
        </head>

        <body>

            <nav class="navbar">
                <div class="logo">
                    Java<span>App</span>
                </div>

                <div class="nav">
                    <a href="#">Home</a>
                    <a href="#">About</a>
                    <a href="#">Services</a>
                    <a href="#">Contact</a>
                </div>
            </nav>

            <section class="hero">

                <div class="content">

                    <div class="badge">
                        SPRING BOOT APPLICATION
                    </div>

                    <h1>
                        Welcome to Your
                        <span>Java Application</span>
                    </h1>

                    <p class="description">
                        A modern web application built with Java and
                        Spring Boot. Ready for CI/CD, Docker, Terraform
                        and Azure cloud deployment.
                    </p>

                    <div class="buttons">
                        <a href="#" class="btn primary">
                            Get Started
                        </a>

                        <a href="#" class="btn secondary">
                            Learn More
                        </a>
                    </div>

                    <div class="cards">

                        <div class="card">
                            <h3>☕ Java</h3>
                            <p>
                                Powerful backend application
                                developed using Java.
                            </p>
                        </div>

                        <div class="card">
                            <h3>⚡ Spring Boot</h3>
                            <p>
                                Fast and lightweight framework
                                for web applications.
                            </p>
                        </div>

                        <div class="card">
                            <h3>🚀 DevOps</h3>
                            <p>
                                Ready for Docker, Terraform,
                                Azure and CI/CD.
                            </p>
                        </div>

                    </div>

                    <footer>
                        © 2026 Java Web Application
                    </footer>

                </div>

            </section>

        </body>
        </html>
        """;
    }
}