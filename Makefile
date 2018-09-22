.PHONY: clean All

All:
	@echo "----------Building project:[ PCO - Debug ]----------"
	@"$(MAKE)" -f  "PCO.mk"
clean:
	@echo "----------Cleaning project:[ PCO - Debug ]----------"
	@"$(MAKE)" -f  "PCO.mk" clean
