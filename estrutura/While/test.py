nota = 75

desempenho = (
    ("Excelente", "Continue assim!") if nota >= 90 else
    ("Bom", "Pode melhorar!") if nota >= 70 else
    ("Satisfatório", "Precisa estudar mais!") if nota >= 50 else
    ("Insatisfatório", "Precisa de ajuda urgente!")
)

categoria, recomendacao = desempenho

# print(f"Desempenho: {categoria}")
# print(f"Recomendação: {recomendacao}")


pontuacao = 850
tempo_gasto = 45  # em minutos
desafios_bonus_completos = 1  # total de 5 desafios

classificacao = (
    "Mestre" if pontuacao >= 1000 and tempo_gasto < 30 and desafios_bonus_completos == 5 else
    "Avançado" if pontuacao >= 1000 and (tempo_gasto < 30 or desafios_bonus_completos == 5) else
    "Intermediário" if pontuacao >= 1000 else
    "Intermediário" if 500 <= pontuacao < 1000 and tempo_gasto < 60 and desafios_bonus_completos >= 2 else
    "Iniciante" if 500 <= pontuacao < 1000 else
    "Novato"
)

print(f"Classificação: {classificacao}")